import Vuex from 'vuex';
import Vue from 'vue';
import featmgtService from '../service/featuremanagement';

Vue.use(Vuex);

const state = {
  features: [],
  component: {
    NewFeature: {
      name: '',
      description: '',
      submitted: false,
      messageAdded: false,
    },
  },
};

const actions = {
  addFeature({ commit }, feature) {
    commit('SUBMIT_NEWFEATURE_FORM');
    featmgtService.addFeature(feature).then(
      (data) => {
        const newfeat = data;
        newfeat.new = true;
        commit('NEW_FEATURE', feature);
        commit('CLEAR_NEWFEATURE_FORM');
      },
    ).catch();
  },
  fillAllFeatures({ commit }) {
    featmgtService.getAllFeatures().then((data) => { commit('FILL_ALL_FEATURE', data); }).catch();
  },
};

const mutations = {
  FILL_ALL_FEATURE(state, features) {
    state.features = features;
  },
  NEW_FEATURE(state, feature) {
    state.features.unshift(feature);
  },
  CLEAR_NEWFEATURE_FORM(state) {
    state.component.NewFeature.name = '';
    state.component.NewFeature.description = '';
    state.component.NewFeature.submitted = false;
    state.component.NewFeature.messageAdded = true;
    setTimeout(() => { state.component.NewFeature.messageAdded = false; }, 1500);
  },
  SUBMIT_NEWFEATURE_FORM(state) {
    state.component.NewFeature.submitted = true;
  },
};

const getters = {
  allFeatures(state) {
    return state.features;
  },
  componentNewFeature(state) {
    return state.component.NewFeature;
  },
};

export default new Vuex.Store({
  state,
  actions,
  mutations,
  getters,
});
